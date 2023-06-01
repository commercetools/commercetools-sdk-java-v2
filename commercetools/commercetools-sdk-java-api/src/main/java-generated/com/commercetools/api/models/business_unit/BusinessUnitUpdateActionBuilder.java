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
import com.commercetools.api.models.business_unit.BusinessUnitUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class BusinessUnitUpdateActionBuilder {

    public com.commercetools.api.models.business_unit.BusinessUnitAddAddressActionBuilder addAddressBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitAddAddressActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitAddAssociateActionBuilder addAssociateBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitAddAssociateActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdActionBuilder addBillingAddressIdBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitAddBillingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdActionBuilder addShippingAddressIdBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitAddShippingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitAddStoreActionBuilder addStoreBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitAddStoreActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionBuilder changeAddressBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitChangeAddressActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateActionBuilder changeAssociateBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateModeActionBuilder changeAssociateModeBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitChangeAssociateModeActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionBuilder changeNameBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitChangeNameActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitActionBuilder changeParentUnitBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitChangeParentUnitActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitChangeStatusActionBuilder changeStatusBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitChangeStatusActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressActionBuilder removeAddressBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitRemoveAddressActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionBuilder removeAssociateBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitRemoveAssociateActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdActionBuilder removeBillingAddressIdBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitRemoveBillingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdActionBuilder removeShippingAddressIdBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitRemoveShippingAddressIdActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreActionBuilder removeStoreBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitRemoveStoreActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldActionBuilder setAddressCustomFieldBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeActionBuilder setAddressCustomTypeBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetAddressCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesActionBuilder setAssociatesBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetAssociatesActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailActionBuilder setContactEmailBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetContactEmailActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressActionBuilder setDefaultBillingAddressBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetDefaultBillingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressActionBuilder setDefaultShippingAddressBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetDefaultShippingAddressActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeActionBuilder setStoreModeBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetStoreModeActionBuilder.of();
    }
    public com.commercetools.api.models.business_unit.BusinessUnitSetStoresActionBuilder setStoresBuilder() {
       return com.commercetools.api.models.business_unit.BusinessUnitSetStoresActionBuilder.of();
    }

    /**
     * factory method for an instance of BusinessUnitUpdateActionBuilder
     * @return builder 
     */
    public static BusinessUnitUpdateActionBuilder of() {
        return new BusinessUnitUpdateActionBuilder();
    }

}
