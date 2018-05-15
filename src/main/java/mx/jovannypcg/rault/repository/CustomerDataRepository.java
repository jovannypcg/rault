package mx.jovannypcg.rault.repository;

import mx.jovannypcg.rault.domain.CustomerData;

public interface CustomerDataRepository {
    CustomerData getData(final String customer);
}
