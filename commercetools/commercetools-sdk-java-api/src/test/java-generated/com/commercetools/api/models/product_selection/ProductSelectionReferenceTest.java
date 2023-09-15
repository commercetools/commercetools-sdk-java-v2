
package com.commercetools.api.models.product_selection;

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
public class ProductSelectionReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionReferenceBuilder builder) {
        ProductSelectionReference productSelectionReference = builder.buildUnchecked();
        Assertions.assertThat(productSelectionReference).isInstanceOf(ProductSelectionReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionReference.builder().id("id") },
                new Object[] { ProductSelectionReference.builder()
                        .obj(new com.commercetools.api.models.product_selection.ProductSelectionImpl()) } };
    }

    @Test
    public void id() {
        ProductSelectionReference value = ProductSelectionReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        ProductSelectionReference value = ProductSelectionReference.of();
        value.setObj(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.product_selection.ProductSelectionImpl());
    }
}
