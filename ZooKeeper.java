public class ZooKeeper extends Staff {
    private int zooKeeperId;

    public ZooKeeper(String name, String email, String phone, int age, String address, int zooKeeperId) {
        super(name, email, phone, age, address);
        this.zooKeeperId = zooKeeperId;
    }

    public void manageAnimal() {
        System.out.println("ZooKeeper with ID " + zooKeeperId + " is managing animals.");
    }

    @Override
    public String toString() {
        return super.toString() + ", ZooKeeperID: " + zooKeeperId;
    }
}
