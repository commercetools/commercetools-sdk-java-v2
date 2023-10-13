
package com.commercetools.api.models.discount_code;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class DiscountCodeResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DiscountCodeResourceIdentifierBuilder builder) {
        DiscountCodeResourceIdentifier discountCodeResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(discountCodeResourceIdentifier).isInstanceOf(DiscountCodeResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DiscountCodeResourceIdentifier.builder().id("id") },
                new Object[] { DiscountCodeResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        DiscountCodeResourceIdentifier value = DiscountCodeResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        DiscountCodeResourceIdentifier value = DiscountCodeResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
