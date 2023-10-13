
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
public class ApprovalRulePredicateSetMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRulePredicateSetMessageBuilder builder) {
        ApprovalRulePredicateSetMessage approvalRulePredicateSetMessage = builder.buildUnchecked();
        Assertions.assertThat(approvalRulePredicateSetMessage).isInstanceOf(ApprovalRulePredicateSetMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRulePredicateSetMessage.builder().predicate("predicate") },
                new Object[] { ApprovalRulePredicateSetMessage.builder().oldPredicate("oldPredicate") } };
    }

    @Test
    public void predicate() {
        ApprovalRulePredicateSetMessage value = ApprovalRulePredicateSetMessage.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void oldPredicate() {
        ApprovalRulePredicateSetMessage value = ApprovalRulePredicateSetMessage.of();
        value.setOldPredicate("oldPredicate");
        Assertions.assertThat(value.getOldPredicate()).isEqualTo("oldPredicate");
    }
}
