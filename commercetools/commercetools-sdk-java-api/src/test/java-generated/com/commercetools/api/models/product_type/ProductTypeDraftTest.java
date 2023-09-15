
package com.commercetools.api.models.product_type;

import java.util.Collections;

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
public class ProductTypeDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTypeDraftBuilder builder) {
        ProductTypeDraft productTypeDraft = builder.buildUnchecked();
        Assertions.assertThat(productTypeDraft).isInstanceOf(ProductTypeDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTypeDraft.builder().key("key") },
                new Object[] { ProductTypeDraft.builder().name("name") },
                new Object[] { ProductTypeDraft.builder().description("description") },
                new Object[] { ProductTypeDraft.builder()
                        .attributes(Collections.singletonList(
                            new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl())) } };
    }

    @Test
    public void key() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void attributes() {
        ProductTypeDraft value = ProductTypeDraft.of();
        value.setAttributes(
            Collections.singletonList(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.api.models.product_type.AttributeDefinitionDraftImpl()));
    }
}
