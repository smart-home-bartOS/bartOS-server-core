package org.bartos.spi.common;

import java.util.Set;

public interface BartSessionFactory {
    BartSessionFactory create();

    Set<Spi> getAllSPIs();

    Spi getSpi(Class<? extends Provider> providerClass);

    <T extends Provider> ProviderFactory<T> getProviderFactory(Class<T> clazz);

    <T extends Provider> ProviderFactory<T> getProviderFactory(Class<T> clazz, String id);

    void close();
}