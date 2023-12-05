
package com.commercetools.api.models.error;

import java.util.Collections;

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
public class AssociateMissingPermissionErrorTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AssociateMissingPermissionErrorBuilder builder) {
        AssociateMissingPermissionError associateMissingPermissionError = builder.buildUnchecked();
        Assertions.assertThat(associateMissingPermissionError).isInstanceOf(AssociateMissingPermissionError.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { AssociateMissingPermissionError.builder().message("message") },
                new Object[] { AssociateMissingPermissionError.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { AssociateMissingPermissionError.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl()) },
                new Object[] { AssociateMissingPermissionError.builder()
                        .associateOnBehalf(
                            new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl()) },
                new Object[] { AssociateMissingPermissionError.builder()
                        .permissions(Collections.singletonList(
                            com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits"))) } };
    }

    @Test
    public void message() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setMessage("message");
        Assertions.assertThat(value.getMessage()).isEqualTo("message");
    }

    @Test
    public void associate() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void businessUnit() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierImpl());
    }

    @Test
    public void associateOnBehalf() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setAssociateOnBehalf(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
        Assertions.assertThat(value.getAssociateOnBehalf())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerResourceIdentifierImpl());
    }

    @Test
    public void permissions() {
        AssociateMissingPermissionError value = AssociateMissingPermissionError.of();
        value.setPermissions(Collections
                .singletonList(com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
        Assertions.assertThat(value.getPermissions())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.associate_role.Permission.findEnum("AddChildUnits")));
    }
}
