
package com.commercetools.api.models.message;

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
public class ApprovalRulePredicateSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRulePredicateSetMessagePayloadBuilder builder) {
        ApprovalRulePredicateSetMessagePayload approvalRulePredicateSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalRulePredicateSetMessagePayload)
                .isInstanceOf(ApprovalRulePredicateSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalRulePredicateSetMessagePayload.builder().predicate("predicate") },
                new Object[] { ApprovalRulePredicateSetMessagePayload.builder().oldPredicate("oldPredicate") } };
    }

    @Test
    public void predicate() {
        ApprovalRulePredicateSetMessagePayload value = ApprovalRulePredicateSetMessagePayload.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void oldPredicate() {
        ApprovalRulePredicateSetMessagePayload value = ApprovalRulePredicateSetMessagePayload.of();
        value.setOldPredicate("oldPredicate");
        Assertions.assertThat(value.getOldPredicate()).isEqualTo("oldPredicate");
    }
}
