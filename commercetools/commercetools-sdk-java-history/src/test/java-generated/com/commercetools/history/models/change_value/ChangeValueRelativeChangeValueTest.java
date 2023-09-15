
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
public class ChangeValueRelativeChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ChangeValueRelativeChangeValueBuilder builder) {
        ChangeValueRelativeChangeValue changeValueRelativeChangeValue = builder.buildUnchecked();
        Assertions.assertThat(changeValueRelativeChangeValue).isInstanceOf(ChangeValueRelativeChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ChangeValueRelativeChangeValue.builder().permyriad(1) } };
    }

    @Test
    public void permyriad() {
        ChangeValueRelativeChangeValue value = ChangeValueRelativeChangeValue.of();
        value.setPermyriad(1);
        Assertions.assertThat(value.getPermyriad()).isEqualTo(1);
    }
}
