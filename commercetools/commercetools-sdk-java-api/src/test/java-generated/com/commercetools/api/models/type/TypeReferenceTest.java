
package com.commercetools.api.models.type;

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
public class TypeReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TypeReferenceBuilder builder) {
        TypeReference typeReference = builder.buildUnchecked();
        Assertions.assertThat(typeReference).isInstanceOf(TypeReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TypeReference.builder().id("id") },
                new Object[] { TypeReference.builder().obj(new com.commercetools.api.models.type.TypeImpl()) } };
    }

    @Test
    public void id() {
        TypeReference value = TypeReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void obj() {
        TypeReference value = TypeReference.of();
        value.setObj(new com.commercetools.api.models.type.TypeImpl());
        Assertions.assertThat(value.getObj()).isEqualTo(new com.commercetools.api.models.type.TypeImpl());
    }
}
