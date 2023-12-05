
package com.commercetools.history.models.common;

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
public class ReferenceTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReferenceBuilder builder) {
        Reference reference = builder.buildUnchecked();
        Assertions.assertThat(reference).isInstanceOf(Reference.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Reference.builder().id("id") }, new Object[] { Reference.builder()
                .typeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role")) } };
    }

    @Test
    public void id() {
        Reference value = Reference.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void typeId() {
        Reference value = Reference.of();
        value.setTypeId(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
        Assertions.assertThat(value.getTypeId())
                .isEqualTo(com.commercetools.history.models.common.ReferenceTypeId.findEnum("associate-role"));
    }
}
