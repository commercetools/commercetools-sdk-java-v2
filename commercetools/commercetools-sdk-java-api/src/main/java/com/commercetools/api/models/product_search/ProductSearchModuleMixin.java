
package com.commercetools.api.models.product_search;

import com.commercetools.api.RegisterSimpleModuleMixin;
import com.commercetools.api.SimpleModuleMixin;
import com.commercetools.api.json.ProductSearchFacetResultMixin;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

@RegisterSimpleModuleMixin
public class ProductSearchModuleMixin implements SimpleModuleMixin {
    public void mixin(SimpleModule module, ModuleOptions options) {
        module.setMixInAnnotation(ProductSearchFacetResult.class, ProductSearchFacetResultMixin.class);
    }
}
