
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
public class ProductTypeAddAttributeDefinitionActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeAddAttributeDefinitionActionBuilder builder) {
        ProductTypeAddAttributeDefinitionAction productTypeAddAttributeDefinitionAction = builder.buildUnchecked();
        Assertions.assertThat(productTypeAddAttributeDefinitionAction)
                .isInstanceOf(ProductTypeAddAttributeDefinitionAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeAddAttributeDefinitionAction.builder()
                .attribute(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl()) } };
    }

    @Test
    public void attribute() {
        ProductTypeAddAttributeDefinitionAction value = ProductTypeAddAttributeDefinitionAction.of();
        value.setAttribute(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl());
        Assertions.assertThat(value.getAttribute())
                .isEqualTo(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl());
    }
}
