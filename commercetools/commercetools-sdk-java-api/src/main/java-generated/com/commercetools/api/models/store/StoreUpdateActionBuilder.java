package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreAddCountryAction;
import com.commercetools.api.models.store.StoreAddDistributionChannelAction;
import com.commercetools.api.models.store.StoreAddProductSelectionAction;
import com.commercetools.api.models.store.StoreAddSupplyChannelAction;
import com.commercetools.api.models.store.StoreChangeProductSelectionAction;
import com.commercetools.api.models.store.StoreRemoveCountryAction;
import com.commercetools.api.models.store.StoreRemoveDistributionChannelAction;
import com.commercetools.api.models.store.StoreRemoveProductSelectionAction;
import com.commercetools.api.models.store.StoreRemoveSupplyChannelAction;
import com.commercetools.api.models.store.StoreSetCountriesAction;
import com.commercetools.api.models.store.StoreSetCustomFieldAction;
import com.commercetools.api.models.store.StoreSetCustomTypeAction;
import com.commercetools.api.models.store.StoreSetDistributionChannelsAction;
import com.commercetools.api.models.store.StoreSetLanguagesAction;
import com.commercetools.api.models.store.StoreSetNameAction;
import com.commercetools.api.models.store.StoreSetProductSelectionsAction;
import com.commercetools.api.models.store.StoreSetSupplyChannelsAction;
import com.commercetools.api.models.store.StoreUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreUpdateActionBuilder {

    public com.commercetools.api.models.store.StoreAddCountryActionBuilder addCountryBuilder() {
       return com.commercetools.api.models.store.StoreAddCountryActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreAddDistributionChannelActionBuilder addDistributionChannelBuilder() {
       return com.commercetools.api.models.store.StoreAddDistributionChannelActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreAddProductSelectionActionBuilder addProductSelectionBuilder() {
       return com.commercetools.api.models.store.StoreAddProductSelectionActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreAddSupplyChannelActionBuilder addSupplyChannelBuilder() {
       return com.commercetools.api.models.store.StoreAddSupplyChannelActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreChangeProductSelectionActionBuilder changeProductSelectionActiveBuilder() {
       return com.commercetools.api.models.store.StoreChangeProductSelectionActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreRemoveCountryActionBuilder removeCountryBuilder() {
       return com.commercetools.api.models.store.StoreRemoveCountryActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreRemoveDistributionChannelActionBuilder removeDistributionChannelBuilder() {
       return com.commercetools.api.models.store.StoreRemoveDistributionChannelActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreRemoveProductSelectionActionBuilder removeProductSelectionBuilder() {
       return com.commercetools.api.models.store.StoreRemoveProductSelectionActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreRemoveSupplyChannelActionBuilder removeSupplyChannelBuilder() {
       return com.commercetools.api.models.store.StoreRemoveSupplyChannelActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetCountriesActionBuilder setCountriesBuilder() {
       return com.commercetools.api.models.store.StoreSetCountriesActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetCustomFieldActionBuilder setCustomFieldBuilder() {
       return com.commercetools.api.models.store.StoreSetCustomFieldActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetCustomTypeActionBuilder setCustomTypeBuilder() {
       return com.commercetools.api.models.store.StoreSetCustomTypeActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetDistributionChannelsActionBuilder setDistributionChannelsBuilder() {
       return com.commercetools.api.models.store.StoreSetDistributionChannelsActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetLanguagesActionBuilder setLanguagesBuilder() {
       return com.commercetools.api.models.store.StoreSetLanguagesActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetNameActionBuilder setNameBuilder() {
       return com.commercetools.api.models.store.StoreSetNameActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetProductSelectionsActionBuilder setProductSelectionsBuilder() {
       return com.commercetools.api.models.store.StoreSetProductSelectionsActionBuilder.of();
    }
    public com.commercetools.api.models.store.StoreSetSupplyChannelsActionBuilder setSupplyChannelsBuilder() {
       return com.commercetools.api.models.store.StoreSetSupplyChannelsActionBuilder.of();
    }

    /**
     * factory method for an instance of StoreUpdateActionBuilder
     * @return builder 
     */
    public static StoreUpdateActionBuilder of() {
        return new StoreUpdateActionBuilder();
    }

}
