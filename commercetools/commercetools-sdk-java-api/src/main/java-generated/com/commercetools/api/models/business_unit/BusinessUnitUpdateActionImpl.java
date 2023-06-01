package com.commercetools.api.models.business_unit;

import com.commercetools.api.models.business_unit.BusinessUnitAddAddressAction;
import com.commercetools.api.models.business_unit.BusinessUnitAddAssociateAction;
import com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdAction;
import com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdAction;
import com.commercetools.api.models.business_unit.BusinessUnitAddStoreAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeAddressAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateModeAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeNameAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitAction;
import com.commercetools.api.models.business_unit.BusinessUnitChangeStatusAction;
import com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressAction;
import com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateAction;
import com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdAction;
import com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdAction;
import com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeAction;
import com.commercetools.api.models.business_unit.BusinessUnitSetStoresAction;
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
 * BusinessUnitUpdateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitUpdateActionImpl implements BusinessUnitUpdateAction, ModelBase {

    
    private String action;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitUpdateActionImpl(@JsonProperty("action") final String action) {
        this.action = action;
    }
    /**
     * create empty instance
     */
    public BusinessUnitUpdateActionImpl() {
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
    
        BusinessUnitUpdateActionImpl that = (BusinessUnitUpdateActionImpl) o;
    
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
