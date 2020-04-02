import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {



    @org.junit.jupiter.api.Test
    void binarySearch1() {
        BinarySearch bn = new BinarySearch();
//        assertEquals(1,-1,bn.binarySearch(1));
        assertEquals(-1,-1,bn.binarySearch(1));

        assertEquals(2,2,bn.binarySearch(2));
        assertEquals(1,1,bn.binarySearch(4));
        assertEquals(3,3,bn.binarySearch(10));
    }

}