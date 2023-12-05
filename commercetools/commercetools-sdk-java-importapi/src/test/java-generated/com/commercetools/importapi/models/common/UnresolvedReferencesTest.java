
package com.commercetools.importapi.models.common;

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
public class UnresolvedReferencesTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(UnresolvedReferencesBuilder builder) {
        UnresolvedReferences unresolvedReferences = builder.buildUnchecked();
        Assertions.assertThat(unresolvedReferences).isInstanceOf(UnresolvedReferences.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { UnresolvedReferences.builder().key("key") },
                new Object[] { UnresolvedReferences.builder()
                        .typeId(com.commercetools.importapi.models.common.ReferenceType.findEnum("cart")) } };
    }

    @Test
    public void key() {
        UnresolvedReferences value = UnresolvedReferences.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void typeId() {
        UnresolvedReferences value = UnresolvedReferences.of();
        value.setTypeId(com.commercetools.importapi.models.common.ReferenceType.findEnum("cart"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.importapi.models.common.ReferenceType.findEnum("cart"));
    }
}
