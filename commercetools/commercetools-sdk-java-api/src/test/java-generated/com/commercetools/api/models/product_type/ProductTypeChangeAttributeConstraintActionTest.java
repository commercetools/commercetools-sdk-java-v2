
package com.commercetools.api.models.product_type;

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
public class ProductTypeChangeAttributeConstraintActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeChangeAttributeConstraintActionBuilder builder) {
        ProductTypeChangeAttributeConstraintAction productTypeChangeAttributeConstraintAction = builder
                .buildUnchecked();
        Assertions.assertThat(productTypeChangeAttributeConstraintAction)
                .isInstanceOf(ProductTypeChangeAttributeConstraintAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductTypeChangeAttributeConstraintAction.builder().attributeName("attributeName") },
                new Object[] { ProductTypeChangeAttributeConstraintAction.builder()
                        .newValue(com.commercetools.api.models.product_type.AttributeConstraintEnumDraft
                                .findEnum("None")) } };
    }

    @Test
    public void attributeName() {
        ProductTypeChangeAttributeConstraintAction value = ProductTypeChangeAttributeConstraintAction.of();
        value.setAttributeName("attributeName");
        Assertions.assertThat(value.getAttributeName()).isEqualTo("attributeName");
    }

    @Test
    public void newValue() {
        ProductTypeChangeAttributeConstraintAction value = ProductTypeChangeAttributeConstraintAction.of();
        value.setNewValue(com.commercetools.api.models.product_type.AttributeConstraintEnumDraft.findEnum("None"));
        Assertions.assertThat(value.getNewValue())
                .isEqualTo(com.commercetools.api.models.product_type.AttributeConstraintEnumDraft.findEnum("None"));
    }
}
