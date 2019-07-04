template <domain D : yao2p>
D uint32 sum(D uint32[[1]] arr) {
    uint n = size(arr);
    if (n == 0) return 0;
    while (n > 1) {
        uint smallHalf = n / 2; // Rounds down
        uint bigHalf = n - smallHalf;
        arr[: smallHalf] += arr[bigHalf : n];
        n = bigHalf;
    }
    return arr[0];
}
