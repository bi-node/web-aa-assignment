package service;

import com.binode.midtermmocktest.model.Address;

import java.util.List;

public interface AddressService {
    public void addAddress(Address address);
    public List<Address> getAddresses();
    public Address getAddress(int id);
    public void deleteAddress(int id);

}
