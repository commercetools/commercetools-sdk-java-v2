
package com.commercetools;

import com.commercetools.api.models.common.Address;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressTest {

    @Test
    public void equalsIgnoreId() {
        Address address1 = Address.builder().id("123").country("DE").build();
        Address address2 = Address.builder().id("234").country("DE").build();

        Assertions.assertThat(address1).isNotEqualTo(address2);
        Assertions.assertThat(address1.equalsIgnoreId(address2)).isTrue();
    }
}
