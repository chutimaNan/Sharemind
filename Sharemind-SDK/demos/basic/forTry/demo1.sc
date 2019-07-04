import shared3p;
import stdlib;

/*kind shared3p {
    type bool;
    type uint;
}*/


domain pd_shared3p shared3p;

void main () {
    pd_shared3p uint x = 3;
    pd_shared3p uint y = 5;
    public bool z = declassify(x < y);
    print("x < y = ", z);

    pd_shared3p bool b;
    x = (uint) z * (x - y) + y;
    print("x = ", x);



}
