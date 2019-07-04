import shared3p;
import stdlib;

domain pd_shared3p shared3p;



void main () {
    pd_shared3p uint x = 3;
    pd_shared3p uint y = 5;
    public uint z;
    print("z = ", declassify(x * y));
}


