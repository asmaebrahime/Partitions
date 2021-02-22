package partition;

import com.partition.service.Partition;
import com.partition.serviceImpl.PartitionImpl;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartitionTest {

    @Test(expected = Test.None.class)
    public void partitionIntegerList() throws Exception {
        Partition<Integer> listeInteger = new PartitionImpl<Integer>(Integer.class);
        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(Arrays.asList(5), listeInteger.partitionList(liste, 2).get(2));
    }


    @Test(expected = IllegalArgumentException.class)
    public void partitionListNull() {
        Partition<Integer> listeInteger = new PartitionImpl<Integer>(Integer.class);
        listeInteger.partitionList(null, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partitionListNegatif() {
        Partition<Integer> listeInteger = new PartitionImpl<Integer>(Integer.class);
        listeInteger.partitionList(Arrays.asList(1, 2, 3, 4, 5), -2);
    }
    
}
