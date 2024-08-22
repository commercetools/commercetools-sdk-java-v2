
package com.commercetools.importapi.models.errors;

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
public class ReferencedResourceNotFoundTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReferencedResourceNotFoundBuilder builder) {
        ReferencedResourceNotFound referencedResourceNotFound = builder.buildUnchecked();
        Assertions.assertThat(referencedResourceNotFound).isInstanceOf(ReferencedResourceNotFound.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReferencedResourceNotFound.builder().message("message") },
                new Object[] { ReferencedResourceNotFound.builder()
                        .typeId(com.commercetools.importapi.models.common.ReferenceType.findEnum("cart")) },
                new Object[] { ReferencedResourceNotFound.builder().id("id") },
                new Object[] { ReferencedResourceNotFound.builder().key("key") } };
    }

    @Test
    public void message() {
        ReferencedResourceNotFound value = ReferencedResourceNotFound.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void typeId() {
        ReferencedResourceNotFound value = ReferencedResourceNotFound.of();
        value.setTypeId(com.commercetools.importapi.models.common.ReferenceType.findEnum("cart"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.importapi.models.common.ReferenceType.findEnum("cart"));
    }

    @Test
    public void id() {
        ReferencedResourceNotFound value = ReferencedResourceNotFound.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ReferencedResourceNotFound value = ReferencedResourceNotFound.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
