import java.util.ArrayList;

public class Main {
    /*
        Hash = digital signature

        Each block will have:
            List of transactions
            Previous hash

            Hash
     */

    // Blockchain
    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        // Genesis Block
        String[] genesisTransactions = {"Satoshi send Alfonzo 1000000000 Bitcoin", "Jerry sent Jeofry 50 Bitcoin"};
        Block genesisBlock = new Block(0, genesisTransactions);

        // Block 2
        String[] block2Transactions = {"Edard send 10000 Bitcoin to Dean", "Ronan send 500000 Bitcoin to Dean"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        System.out.println("Hash of block 1");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of block 2");
        System.out.println(block2.getBlockHash());
    }
}
