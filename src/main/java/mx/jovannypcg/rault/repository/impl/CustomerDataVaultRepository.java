package mx.jovannypcg.rault.repository.impl;

import mx.jovannypcg.rault.domain.CustomerData;
import mx.jovannypcg.rault.repository.CustomerDataRepository;
import org.springframework.stereotype.Repository;
import org.springframework.vault.core.VaultOperations;
import org.springframework.vault.support.VaultResponseSupport;

@Repository
public class CustomerDataVaultRepository implements CustomerDataRepository {
    private VaultOperations vaultOperations;

    public CustomerDataVaultRepository(VaultOperations vaultOperations) {
        this.vaultOperations = vaultOperations;
    }

    @Override
    public CustomerData getData(String customer) {
        VaultResponseSupport<CustomerData> response =
                vaultOperations.read("secret/saml-api/" + customer, CustomerData.class);

        return response.getData();
    }
}
