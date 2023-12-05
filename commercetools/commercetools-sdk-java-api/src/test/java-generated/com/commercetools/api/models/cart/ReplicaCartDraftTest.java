
package com.commercetools.api.models.cart;

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
public class ReplicaCartDraftTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ReplicaCartDraftBuilder builder) {
        ReplicaCartDraft replicaCartDraft = builder.buildUnchecked();
        Assertions.assertThat(replicaCartDraft).isInstanceOf(ReplicaCartDraft.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        ReplicaCartDraft.builder().reference(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { ReplicaCartDraft.builder().key("key") } };
    }

    @Test
    public void reference() {
        ReplicaCartDraft value = ReplicaCartDraft.of();
        value.setReference(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getReference()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void key() {
        ReplicaCartDraft value = ReplicaCartDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
