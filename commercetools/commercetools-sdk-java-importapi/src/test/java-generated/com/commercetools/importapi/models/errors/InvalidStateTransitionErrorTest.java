
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
public class InvalidStateTransitionErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(InvalidStateTransitionErrorBuilder builder) {
        InvalidStateTransitionError invalidStateTransitionError = builder.buildUnchecked();
        Assertions.assertThat(invalidStateTransitionError).isInstanceOf(InvalidStateTransitionError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { InvalidStateTransitionError.builder()
                .currentState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing")) },
                new Object[] { InvalidStateTransitionError.builder()
                        .newState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing")) } };
    }

    @Test
    public void currentState() {
        InvalidStateTransitionError value = InvalidStateTransitionError.of();
        value.setCurrentState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
        Assertions.assertThat(value.getCurrentState())
                .isEqualTo(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
    }

    @Test
    public void newState() {
        InvalidStateTransitionError value = InvalidStateTransitionError.of();
        value.setNewState(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
        Assertions.assertThat(value.getNewState())
                .isEqualTo(com.commercetools.importapi.models.common.ProcessingState.findEnum("processing"));
    }
}
