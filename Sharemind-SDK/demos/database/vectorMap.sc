import shared3p;
import shared3p_table_database;
import stdlib;
import table_database;
domain pd_shared3p shared3p;
void main() {
    uint vmap = tdbVmapNew();
    // We can add values of different type to the same vector so this
    // can be used as a heterogeneous collection.
    uint[[1]] x = {1, 2};
    tdbVmapAddValue(vmap, "key", x);
    float[[1]] y = {30};
    tdbVmapAddValue(vmap, "key", y);
    uint[[1]] xres = tdbVmapGetValue(vmap, "key", 0 :: uint);
    print("First element of 'key':");
    printVector(xres);
    float[[1]] yres = tdbVmapGetValue(vmap, "key", 1 :: uint);
    print("Second element of 'key':");
    printVector(yres);
    // We have different functions for string types. Strings and
    // primitive types can't be in the same vector so we use a
    // different key in the vector map.
    tdbVmapAddString(vmap, "strings", "foobar");
    print("First element of 'strings': ", tdbVmapGetString(vmap, "strings", 0 :: uint));
    // Count the number of elements in a vector
    print("Number of elements of 'key': ", tostring(tdbVmapValueVectorSize(vmap, "key")));
    // Count the number of vectors in a vector map with a specific
    // key. This is useful to test if the map contains the key.
    print("Map contains 'baz'? ", tdbVmapCount(vmap, "baz") > 0);
    tdbVmapDelete(vmap);
}
