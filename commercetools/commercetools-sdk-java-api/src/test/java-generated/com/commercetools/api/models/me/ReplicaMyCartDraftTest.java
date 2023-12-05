
package com.commercetools.api.models.me;

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
public class ReplicaMyCartDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReplicaMyCartDraftBuilder builder) {
        ReplicaMyCartDraft replicaMyCartDraft = builder.buildUnchecked();
        Assertions.assertThat(replicaMyCartDraft).isInstanceOf(ReplicaMyCartDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ReplicaMyCartDraft.builder().reference("reference") } };
    }

    @Test
    public void reference() {
        ReplicaMyCartDraft value = ReplicaMyCartDraft.of();
        value.setReference("reference");
        Assertions.assertThat(value.getReference()).isEqualTo("reference");
    }
}
