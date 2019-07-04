import shared3p;
import stdlib;

domain pd_shared3p shared3p;

template <domain D : shared3p>
D uint64[[1]] operator * (D uint64[[1]] x, D uint64[[1]] y) {
    D uint64[[1]] res (size (x));
    __syscall ("shared3p::mul_uint64_vec", __domainid (D), x, y, res);
    return res;
}

void main()
{
    pd_shared3p uint x;
    pd_shared3p uint y;
    x = 5;
    y = 3;

    print("input:");
    print("x = ", declassify(x));
    //printVector(declassify(x));
    pd_shared3p uint64[[1]] output = operator * (x, y);
}
