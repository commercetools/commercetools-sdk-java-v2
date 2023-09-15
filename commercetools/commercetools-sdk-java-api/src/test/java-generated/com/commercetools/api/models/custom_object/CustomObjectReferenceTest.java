
package com.commercetools.api.models.custom_object;

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
public class CustomObjectReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomObjectReferenceBuilder builder) {
        CustomObjectReference customObjectReference = builder.buildUnchecked();
        Assertions.assertThat(customObjectReference).isInstanceOf(CustomObjectReference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomObjectReference.builder()
                        .obj(new com.commercetools.api.models.custom_object.CustomObjectImpl()) },
                new Object[] { CustomObjectReference.builder().id("id") } };
    }

    @Test
    public void obj() {
        CustomObjectReference value = CustomObjectReference.of();
        value.setObj(new com.commercetools.api.models.custom_object.CustomObjectImpl());
        Assertions.assertThat(value.getObj())
                .isEqualTo(new com.commercetools.api.models.custom_object.CustomObjectImpl());
    }

    @Test
    public void id() {
        CustomObjectReference value = CustomObjectReference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }
}
