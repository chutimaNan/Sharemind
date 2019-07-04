import shared3p;
import stdlib;

domain pd_shared3p shared3p;

void main()
{
    /*Array Expression
    int[[1]] full; // empty right now
    int[[1]] arr(10);

    full = arr; // no longer empty
    arr = 1; // all values set to 1
    arr = 2;
    print("arr = ", _vectorToString(arr));
    print("full = ", _vectorToString(full));


    int[[1]] a(10);
    int[[1]] b(10);
    ++ b;
    // point-wise operations:
    a = b + b;
    print("a = ", _vectorToString(a));

    ++ a;
    print("newA = ", _vectorToString(a));
    // implicit conversions:
    b = 2 * a;
    print("b = ", _vectorToString(b));
    a = 5;
    print("a = ", _vectorToString(a));*/

    // indexing array
    /*int[[1]] arr(5) = 1;
    int val = arr[0]; // val == 1
    arr[1] = 5; // second element of arr is now 0
    print("arr = ", _vectorToString(arr));
    print("val = ", val);*/

    int[[1]] arr(5);
    arr[1:4] = 1;
    arr[2:3] = 2;
    print("arr = ", _vectorToString(arr));
    // arr == [0 ,1 ,2 ,1 ,0]

    /*int[[3]] arr(2, 3, 5);
    //print("arr = ", _vectorToString(arr));
    // size(arr) == 2*3*5
    int[[1]] empty ;
    // size(empty) == 0*/

    //private int val;
    // read the val from database
    // do some computation on data
    //bool result = declassify (val < 0);

    /*template <domain D : shared3p>
    D uint64[[1]] operator * (D uint64[[1]] x, D uint64[[1]] y) {
        D uint64[[1]] res (size (x));
        __syscall ("shared3p::mul_uint64_vec", __domainid (D), x, y, res);
        return res;*/
    //}
}
