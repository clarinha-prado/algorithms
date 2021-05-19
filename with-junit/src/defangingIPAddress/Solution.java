package defangingIPAddress;

public class Solution {
    public String defangIPaddr(String address) {
    	String output = address.replaceAll("\\.", "[.]");
        return output;
    }
}
