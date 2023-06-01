package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeChangeCartDiscountsAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction;
import com.commercetools.api.models.discount_code.DiscountCodeChangeIsActiveAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCustomFieldAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetCustomTypeAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetDescriptionAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetNameAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidFromAndUntilAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetValidUntilAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * DiscountCodeUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeUpdateActionImpl implements DiscountCodeUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public DiscountCodeUpdateActionImpl() {
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DiscountCodeUpdateActionImpl that = (DiscountCodeUpdateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .toHashCode();
    }

}
