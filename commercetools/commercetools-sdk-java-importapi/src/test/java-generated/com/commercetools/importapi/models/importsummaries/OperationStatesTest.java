
package com.commercetools.importapi.models.importsummaries;

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
public class OperationStatesTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OperationStatesBuilder builder) {
        OperationStates operationStates = builder.buildUnchecked();
        Assertions.assertThat(operationStates).isInstanceOf(OperationStates.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { OperationStates.builder().processing(4L) },
                new Object[] { OperationStates.builder().validationFailed(8L) },
                new Object[] { OperationStates.builder().unresolved(5L) },
                new Object[] { OperationStates.builder().waitForMasterVariant(8L) },
                new Object[] { OperationStates.builder().imported(1L) },
                new Object[] { OperationStates.builder().rejected(3L) },
                new Object[] { OperationStates.builder().canceled(5L) } };
    }

    @Test
    public void processing() {
        OperationStates value = OperationStates.of();
        value.setProcessing(4L);
        Assertions.assertThat(value.getProcessing()).isEqualTo(4L);
    }

    @Test
    public void validationFailed() {
        OperationStates value = OperationStates.of();
        value.setValidationFailed(8L);
        Assertions.assertThat(value.getValidationFailed()).isEqualTo(8L);
    }

    @Test
    public void unresolved() {
        OperationStates value = OperationStates.of();
        value.setUnresolved(5L);
        Assertions.assertThat(value.getUnresolved()).isEqualTo(5L);
    }

    @Test
    public void waitForMasterVariant() {
        OperationStates value = OperationStates.of();
        value.setWaitForMasterVariant(8L);
        Assertions.assertThat(value.getWaitForMasterVariant()).isEqualTo(8L);
    }

    @Test
    public void imported() {
        OperationStates value = OperationStates.of();
        value.setImported(1L);
        Assertions.assertThat(value.getImported()).isEqualTo(1L);
    }

    @Test
    public void rejected() {
        OperationStates value = OperationStates.of();
        value.setRejected(3L);
        Assertions.assertThat(value.getRejected()).isEqualTo(3L);
    }

    @Test
    public void canceled() {
        OperationStates value = OperationStates.of();
        value.setCanceled(5L);
        Assertions.assertThat(value.getCanceled()).isEqualTo(5L);
    }
}
