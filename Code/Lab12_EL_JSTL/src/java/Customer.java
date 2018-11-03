
import java.util.HashMap;

public class Customer {

    private String name;

    public static final int HEAD_OFFICE = 0;    //公司地址
    public static final int BILLING = 1;        //帳單地址
    public static final int DELIVERY = 2;       //郵寄地址

    private final Address[] addresses = new Address[3];

    public Customer(String name, Address office, Address billing, Address delivery) {
        this.name = name;
        addresses[HEAD_OFFICE] = office;
        addresses[BILLING] = billing;
        addresses[DELIVERY] = delivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public Address getOfficeAddress() {
        return addresses[HEAD_OFFICE];
    }

    public Address getBillingAddress() {
        return addresses[BILLING];
    }

    public Address getDeliveryAddress() {
        return addresses[DELIVERY];
    }

    //測試用的假資料
    private static final HashMap<Integer, Customer> customers = new HashMap<>();

    //靜態初始化區塊，用來初始化靜態資料
    static {
        customers.put(1, new Customer("Fred Bloggs",
                new Address("1750 Crumlin Road", "小Town村", "London", "Ontario", "N5B 3V6"),
                new Address("6780 Collier Drive", "李奧瑞克Highland", "Paris", "Texas", "75462"),
                new Address("1 Airport Road", "紀念碑Valley", "Machestar", "New Hampshire", "03103")));
    }

    public static Customer getCustomer(int id) {
        return customers.get(id);
    }

    public static HashMap<Integer, Customer> getCustomers() {
        return customers;
    }

}
