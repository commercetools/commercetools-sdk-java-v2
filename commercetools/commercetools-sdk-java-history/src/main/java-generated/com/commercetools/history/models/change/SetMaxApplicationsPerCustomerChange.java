
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetMaxApplicationsPerCustomerChangeImpl.class)
public interface SetMaxApplicationsPerCustomerChange extends Change {

    String SET_MAX_APPLICATIONS_PER_CUSTOMER_CHANGE = "SetMaxApplicationsPerCustomerChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMaxApplicationsPerCustomer</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Integer previousValue);

    public void setNextValue(final Integer nextValue);

    public static SetMaxApplicationsPerCustomerChange of() {
        return new SetMaxApplicationsPerCustomerChangeImpl();
    }

    public static SetMaxApplicationsPerCustomerChange of(final SetMaxApplicationsPerCustomerChange template) {
        SetMaxApplicationsPerCustomerChangeImpl instance = new SetMaxApplicationsPerCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMaxApplicationsPerCustomerChangeBuilder builder() {
        return SetMaxApplicationsPerCustomerChangeBuilder.of();
    }

    public static SetMaxApplicationsPerCustomerChangeBuilder builder(
            final SetMaxApplicationsPerCustomerChange template) {
        return SetMaxApplicationsPerCustomerChangeBuilder.of(template);
    }

    default <T> T withSetMaxApplicationsPerCustomerChange(Function<SetMaxApplicationsPerCustomerChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMaxApplicationsPerCustomerChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMaxApplicationsPerCustomerChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMaxApplicationsPerCustomerChange>";
            }
        };
    }
}
