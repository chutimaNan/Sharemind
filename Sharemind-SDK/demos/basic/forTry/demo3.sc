import shared3p;
import stdlib;

domain pd_shared3p shared3p;

/*template<domain D : shared3p>
D uint32[[1]] product(D uint32[[1]] x)
{
    return product(x);
}*/


void main()
{
    pd_shared3p uint32[[1]] input = {1,2,3,4,5};
    print("input = ", _vectorToString(declassify(input)));
    //print("Output:2");

    pd_shared3p uint32 outputProduct = product(input);
    print("OutputProduct:");
    print(declassify(outputProduct));

    pd_shared3p uint32 outputMax = max(input);
    print("OutputMax:");
    print(declassify(outputMax));
}
