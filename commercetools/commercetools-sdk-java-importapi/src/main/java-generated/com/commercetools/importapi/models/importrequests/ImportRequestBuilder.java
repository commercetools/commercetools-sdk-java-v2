
package com.commercetools.importapi.models.importrequests;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImportRequestBuilder {

    public com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder categoryBuilder() {
        return com.commercetools.importapi.models.importrequests.CategoryImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder customerBuilder() {
        return com.commercetools.importapi.models.importrequests.CustomerImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder orderBuilder() {
        return com.commercetools.importapi.models.importrequests.OrderImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder orderPatchBuilder() {
        return com.commercetools.importapi.models.importrequests.OrderPatchImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder priceBuilder() {
        return com.commercetools.importapi.models.importrequests.PriceImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder productDraftBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductDraftImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder productBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder productTypeBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductTypeImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder productVariantBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductVariantImportRequestBuilder.of();
    }

    public com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder productVariantPatchBuilder() {
        return com.commercetools.importapi.models.importrequests.ProductVariantPatchRequestBuilder.of();
    }

    public static ImportRequestBuilder of() {
        return new ImportRequestBuilder();
    }
}
