
package com.commercetools.docs.meta;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

/**
 * {@include.toc}
 * <h2>Serialization</h2>
 *
 * <p>The SDK uses <a href="https://github.com/FasterXML/jackson">Jackson</a> for searializing and deserializing JSON.
 * The default configured {@link com.fasterxml.jackson.databind.ObjectMapper} uses some modules to correctly work with our API.
 * The details can be found in {@link io.vrap.rmf.base.client.utils.json.JsonUtils#createObjectMapper(ModuleOptions)}</p>
 *
 * <h3 id="customization">Customization</h3>
 *
 * <p>To allow customization of the ObjectMapper the SDK uses {@link java.util.ServiceLoader} for
 * {@link io.vrap.rmf.base.client.utils.json.ModuleSupplier}. Adding a file
 * <code>resources/META-INF/services/io.vrap.rmf.base.client.utils.json.ModuleSupplier</code> to your project
 * with FQCN of the module supplier to be used will register the supplied modules</p>
 *
 * <p>E.g.:
 * {@include.file commercetools/commercetools-sdk-java-api/src/main/resources/META-INF/services/io.vrap.rmf.base.client.utils.json.ModuleSupplier}
 * {@include.file commercetools/commercetools-sdk-java-api/src/main/java/com/commercetools/api/json/ApiModule.java}
 * </p>
 *
 * <h3 id="date-time-attributes">Date and time attributes</h3>
 *
 * <p>When using Date, Time and DateTime types for product attributes or custom fields the SDK deserializes them as {@link java.time.LocalDate},
 * {@link java.time.LocalTime} and {@link java.time.ZonedDateTime}. As sometimes it may needed to serialize them as {@link String} the ObjectMapper
 * can be configured with {@link ModuleOptions}. The {@link com.commercetools.api.json.ApiModule} also is loading the configuration options
 * using {@link System#getProperty(String)} e.g.: {@link com.commercetools.api.json.ApiModuleOptions#DESERIALIZE_DATE_ATTRIBUTE_AS_STRING commercetools.deserializeDateAttributeAsString}</p>
 * {@include.example example.SerializationTest#dateAsString()}</p>
 *
 * <h3 id="JsonNodes">Use JsonNodes</h3>
 *
 * <p>In case the automatic deserialization of attributes or custom fields is not needed you can set the option {@link com.commercetools.api.json.ApiModuleOptions#DESERIALIZE_ATTRIBUTE_AS_JSON_NODE commercetools.deserializeAttributeAsJsonNode} and/or
 * {@link com.commercetools.api.json.ApiModuleOptions#DESERIALIZE_CUSTOM_FIELD_AS_JSON_NODE commercetools.deserializeCustomFieldAsJsonNode}</p>
 *
 * {@include.example example.SerializationTest#jsonNodes()}
 */
public class Serialization {
}
