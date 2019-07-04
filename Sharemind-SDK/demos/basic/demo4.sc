import additive3pp;
import shamirnpp;
domain a3pp additive3pp;
domain s2of4 shamirnpp;

template <domain D, type T>
D T abs (D T x)
{
    return x < 0 ? -x : x;
}

void main()
{
    a3pp uint x = 5;
    a3pp uint ax = abs(x);
    assert(declasssify(ax) == (5 :: uint));

    s2of4 int y = -5;
    s2of4 int ay = abs(y);
    assert(declassify(ax) == (5 :: int));
}
