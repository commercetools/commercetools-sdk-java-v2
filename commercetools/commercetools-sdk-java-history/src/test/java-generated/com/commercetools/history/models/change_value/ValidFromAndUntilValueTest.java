
package com.commercetools.history.models.change_value;

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
public class ValidFromAndUntilValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ValidFromAndUntilValueBuilder builder) {
        ValidFromAndUntilValue validFromAndUntilValue = builder.buildUnchecked();
        Assertions.assertThat(validFromAndUntilValue).isInstanceOf(ValidFromAndUntilValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ValidFromAndUntilValue.builder().validFrom("validFrom") },
                new Object[] { ValidFromAndUntilValue.builder().validUntil("validUntil") } };
    }

    @Test
    public void validFrom() {
        ValidFromAndUntilValue value = ValidFromAndUntilValue.of();
        value.setValidFrom("validFrom");
        Assertions.assertThat(value.getValidFrom()).isEqualTo("validFrom");
    }

    @Test
    public void validUntil() {
        ValidFromAndUntilValue value = ValidFromAndUntilValue.of();
        value.setValidUntil("validUntil");
        Assertions.assertThat(value.getValidUntil()).isEqualTo("validUntil");
    }
}
