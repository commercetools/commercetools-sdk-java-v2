
package com.commercetools.api.models.cart;

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
public class DirectDiscountReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(DirectDiscountReferenceBuilder builder) {
        DirectDiscountReference directDiscountReference = builder.buildUnchecked();
        Assertions.assertThat(directDiscountReference).isInstanceOf(DirectDiscountReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { DirectDiscountReference.builder().id("id") } };
    }

    @Test
    public void id() {
        DirectDiscountReference value = DirectDiscountReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
