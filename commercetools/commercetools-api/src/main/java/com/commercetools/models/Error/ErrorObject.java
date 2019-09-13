package com.commercetools.models.error;

import com.commercetools.models.error.AccessDeniedError;
import com.commercetools.models.error.ConcurrentModificationError;
import com.commercetools.models.error.DiscountCodeNonApplicableError;
import com.commercetools.models.error.DuplicateAttributeValueError;
import com.commercetools.models.error.DuplicateAttributeValuesError;
import com.commercetools.models.error.DuplicateFieldError;
import com.commercetools.models.error.DuplicateFieldWithConflictingResourceError;
import com.commercetools.models.error.DuplicatePriceScopeError;
import com.commercetools.models.error.DuplicateVariantValuesError;
import com.commercetools.models.error.EnumValueIsUsedError;
import com.commercetools.models.error.ExtensionBadResponseError;
import com.commercetools.models.error.ExtensionNoResponseError;
import com.commercetools.models.error.ExtensionUpdateActionsFailedError;
import com.commercetools.models.error.InsufficientScopeError;
import com.commercetools.models.error.InvalidCredentialsError;
import com.commercetools.models.error.InvalidCurrentPasswordError;
import com.commercetools.models.error.InvalidFieldError;
import com.commercetools.models.error.InvalidInputError;
import com.commercetools.models.error.InvalidItemShippingDetailsError;
import com.commercetools.models.error.InvalidJsonInputError;
import com.commercetools.models.error.InvalidOperationError;
import com.commercetools.models.error.InvalidSubjectError;
import com.commercetools.models.error.InvalidTokenError;
import com.commercetools.models.error.MatchingPriceNotFoundError;
import com.commercetools.models.error.MissingTaxRateForCountryError;
import com.commercetools.models.error.NoMatchingProductDiscountFoundError;
import com.commercetools.models.error.OutOfStockError;
import com.commercetools.models.error.PriceChangedError;
import com.commercetools.models.error.ReferenceExistsError;
import com.commercetools.models.error.RequiredFieldError;
import com.commercetools.models.error.ResourceNotFoundError;
import com.commercetools.models.error.ShippingMethodDoesNotMatchCartError;
import java.lang.String;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.models.error.ExtensionBadResponseErrorImpl.class, name = "ExtensionBadResponse"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.ExtensionNoResponseErrorImpl.class, name = "ExtensionNoResponse"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.ExtensionUpdateActionsFailedErrorImpl.class, name = "ExtensionUpdateActionsFailed"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InsufficientScopeErrorImpl.class, name = "insufficient_scope"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidCredentialsErrorImpl.class, name = "InvalidCredentials"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidCurrentPasswordErrorImpl.class, name = "InvalidCurrentPassword"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidFieldErrorImpl.class, name = "InvalidField"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidInputErrorImpl.class, name = "InvalidInput"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidItemShippingDetailsErrorImpl.class, name = "InvalidItemShippingDetails"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidJsonInputErrorImpl.class, name = "InvalidJsonInput"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidOperationErrorImpl.class, name = "InvalidOperation"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidSubjectErrorImpl.class, name = "InvalidSubject"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.InvalidTokenErrorImpl.class, name = "invalid_token"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.MatchingPriceNotFoundErrorImpl.class, name = "MatchingPriceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.MissingTaxRateForCountryErrorImpl.class, name = "MissingTaxRateForCountry"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.NoMatchingProductDiscountFoundErrorImpl.class, name = "NoMatchingProductDiscountFound"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.OutOfStockErrorImpl.class, name = "OutOfStock"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.PriceChangedErrorImpl.class, name = "PriceChanged"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.ReferenceExistsErrorImpl.class, name = "ReferenceExists"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.RequiredFieldErrorImpl.class, name = "RequiredField"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.ResourceNotFoundErrorImpl.class, name = "ResourceNotFound"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.ShippingMethodDoesNotMatchCartErrorImpl.class, name = "ShippingMethodDoesNotMatchCart"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.AccessDeniedErrorImpl.class, name = "access_denied"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.ConcurrentModificationErrorImpl.class, name = "ConcurrentModification"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.DiscountCodeNonApplicableErrorImpl.class, name = "DiscountCodeNonApplicable"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.DuplicateAttributeValueErrorImpl.class, name = "DuplicateAttributeValue"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.DuplicateAttributeValuesErrorImpl.class, name = "DuplicateAttributeValues"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.DuplicateFieldErrorImpl.class, name = "DuplicateField"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.DuplicateFieldWithConflictingResourceErrorImpl.class, name = "DuplicateFieldWithConflictingResource"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.DuplicatePriceScopeErrorImpl.class, name = "DuplicatePriceScope"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.DuplicateVariantValuesErrorImpl.class, name = "DuplicateVariantValues"),
   @JsonSubTypes.Type(value = com.commercetools.models.error.EnumValueIsUsedErrorImpl.class, name = "EnumValueIsUsed")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "code"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ErrorObject  {

   
   @NotNull
   @JsonProperty("message")
   public String getMessage();

   public void setMessage(final String message);
   


}