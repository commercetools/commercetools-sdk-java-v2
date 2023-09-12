
package com.commercetools.docs.meta;

import com.commercetools.api.client.error.ErrorResponseException;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.error.InvalidFieldError;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.AttributeContainer;
import com.commercetools.api.models.product.AttributesAccessor;
import com.commercetools.api.models.product.ProductVariant;
import com.commercetools.api.models.product.ProductVariantDraftBuilder;
import com.commercetools.api.models.product_type.AttributeDefinition;
import com.commercetools.api.models.product_type.AttributeLocalizedEnumValue;
import com.commercetools.api.models.product_type.AttributePlainEnumValue;
import com.commercetools.api.models.product_type.AttributeType;
import com.commercetools.api.models.product_type.ProductType;
import com.commercetools.ml.models.common.ProductReference;

import io.vrap.rmf.base.client.utils.json.JsonException;

/**
 * {@include.toc}
 <h2 id="intro">Introduction</h2>
 <h3 id="product-type-creation">ProductType Creation</h3>
 <p>A {@link ProductType} is like a schema that defines how the product attributes are structured.</p>
 <p>{@link ProductType}s contain a list of {@link AttributeDefinition}s which corresponds to the name and type of each attribute, along with some additional information".
 Each name/type pair must be unique across a Project, so if you create an attribute "foo" of type String, you cannot create
 another {@link ProductType} where "foo" has another type (e.g. {@link LocalizedString}). If you do it anyway you get an error message like:</p>

<pre>"The attribute with name 'foo' has a different type on product type 'exampleproducttype'."</pre>

 <p>In this scenario we provide two {@link ProductType}s <strong>book</strong> and <strong>tshirt</strong>.</p>


 <p>The book product type contains the following attributes:</p>
 <ul>
    <li>{@code isbn} as {@link String}, International Standard Book Number</li>
 </ul>

 <p>The tshirt product type contains the following attributes:</p>

 <ul>
    <li>{@code color} as {@link AttributeLocalizedEnumValue} with the colors green and red and their translations in German and English</li>
    <li>{@code size} as {@link AttributePlainEnumValue} with S, M and X</li>
    <li>{@code laundrySymbols} as set of {@link AttributeLocalizedEnumValue} with temperature and tumble drying</li>
    <li>{@code matchingProducts} as set of {@link ProductReference}s, which can point to products that are similar to the current product</li>
    <li>{@code rrp} as {@link Money} containing the recommended retail price</li>
    <li>{@code availableSince} as {@link java.time.LocalDateTime} which contains the date since when the product is available for the customer in the shop</li>
 </ul>



 <p>All available attribute types you can find here: {@link AttributeType} in "All Known Implementing Classes".</p>

<p>The code for the creation of the book {@link ProductType}:</p>
 {@include.example  commercetools.product_type.ProductTypeCreationDemoIntegrationTest#createBookProductType()}

<p>The code for the creation of the tshirt {@link ProductType}:</p>
 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#createProductType()}



 <p>{@link ProductType}s have a key (String)
 which can be used as key to logically identify {@link ProductType}s. The key has an unique constraint.

 <h3 id="product-creation">Product Creation</h3>

 <p>To create a product you need to reference the product type. Since the {@link ProductType}
 ID of the development system will not be the ID of the production system it is necessary to find the product type by name:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#fetchProductTypeByName()}

 The simplest way of adding attributes to a {@link ProductVariant} is to use
 {@link ProductVariantDraftBuilder#plusAttributes(Attribute...)} which enables you to directly
 put the value of the attribute to the draft. But it cannot check if you put the right objects and types in it.

 <p>A book example:</p>
 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#createBookProduct()}

 <p>A tshirt example:</p>
 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#createProduct()}

 A wrong value for a field or an invalid type will cause an {@link ErrorResponseException}
 with an error code of {@value InvalidFieldError#INVALID_FIELD}.

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#invalidTypeCausesException()}

 As alternative you could declare your attributes at the same place and use these to read and write
 attribute values:

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#productCreationWithGetterSetter()}


 <h3 id="attribute-access-without-product-type">Reading Attributes</h3>

 <p>The simplest way to get the value of the attribute is to use {@code getValue()} methods of {@link Attribute}, like {@link Attribute#getValue()}:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#readAttributeGetValueAs()}

 <p>If you use a wrong conversion for the attribute, like you have a {@link io.sphere.sdk.models.EnumValue} but extract it as boolean then you get a {@link JsonException}:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#readAttributeGetValueAsWithWrongType()}

 <p>An alternative way to get a value out of an attribute is to use an instance of {@link AttributesAccessor}
 which keeps the type info to deserialize the attribute.</p>

 <p>You can reuse the {@link io.sphere.sdk.products.attributes.NamedAttributeAccess} declaration if you want to:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#readAttributeWithoutProductTypeWithNamedAccess()}

 <p>Or you can access it on the fly:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#readAttributeWithoutProductTypeWithName()}

 <p>If the attribute is not present in the {@link AttributeContainer} then the {@link java.util.Optional} will be empty:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#notPresentAttributeRead()}

 <p>If you provide a wrong type, the code will throw a {@link JsonException}:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#readAttributeWithoutProductTypeWithNamedAccessWithWrongType()}

 <h3 id="attribute-update">Update attribute values of a product</h3>

 <p>Setting attribute values is like a a product creation:</p>


 <p>Example for books:</p>
 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#updateAttributesBooks()}

 <p>Example for tshirts:</p>
 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#updateAttributes()}

 A wrong value for a field or an invalid type (like flat value instead of set) will cause an {@link io.sphere.sdk.client.ErrorResponseException}
 with an error code of {@value InvalidFieldError#INVALID_FIELD}.

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#updateWithWrongType()}

 <h3 id="attributes-in-order-import">Create attributes for importing orders</h3>

 <p>Importing attribute values for orders works different from updating products.
 In orders you provide the full value for enum-like types instead of just the key as done for all other types.
 This makes it possible to create a new enum value on the fly. The other attributes behave as expected.</p>

 <p>Example:</p>

 {@include.example commercetools.product_type.ProductTypeCreationDemoIntegrationTest#orderImportExample()}

 */
public final class ProductAttributeDocumentation {
    private ProductAttributeDocumentation() {
    }
}
