
package com.commercetools.api.models.error;

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
public class ProductAssignmentMissingErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductAssignmentMissingErrorBuilder builder) {
        ProductAssignmentMissingError productAssignmentMissingError = builder.buildUnchecked();
        Assertions.assertThat(productAssignmentMissingError).isInstanceOf(ProductAssignmentMissingError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductAssignmentMissingError.builder().message("message") },
                new Object[] { ProductAssignmentMissingError.builder()
                        .product(new com.commercetools.api.models.product.ProductReferenceImpl()) } };
    }

    @Test
    public void message() {
        ProductAssignmentMissingError value = ProductAssignmentMissingError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void product() {
        ProductAssignmentMissingError value = ProductAssignmentMissingError.of();
        value.setProduct(new com.commercetools.api.models.product.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.api.models.product.ProductReferenceImpl());
    }
}
