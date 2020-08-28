package io.vrap.rmf.base.client;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApiMethod<T extends ApiMethod<T>> {
    public static class ParamEntry<K, V> implements Map.Entry<K, V> {
        protected final K key;
        protected V value;

        public ParamEntry(K key) {
            this.key = key;
        }

        public ParamEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        public String toUriString()
        {
            try {
                return key + "=" + URLEncoder.encode(value.toString(), StandardCharsets.UTF_8.toString());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return "";
        }
    }

    private ApiHttpHeaders headers = new ApiHttpHeaders();
    private List<ParamEntry<String, String>> queryParams = new ArrayList<>();
    private final ApiHttpClient apiHttpClient;

    protected ApiHttpClient apiHttpClient() {
        return apiHttpClient;
    }

    public ApiMethod(final ApiHttpClient apiHttpClient){
        this.apiHttpClient = apiHttpClient;
    }
    public ApiMethod(final ApiMethod<T> apiMethod){
        this.apiHttpClient = apiMethod.apiHttpClient;
        this.headers = apiMethod.headers;
        this.queryParams =  new ArrayList<>(apiMethod.queryParams);
    }

    public T addHeader(final String key, final String value) {
        this.headers.addHeader(key, value);
        return (T)this;
    }

    public T withHeaders(final ApiHttpHeaders headers) {
        this.headers = headers;
        return (T)this;
    }

    public ApiHttpHeaders getHeaders() {
        return this.headers;
    }

    public <V> T addQueryParam(final String key, final V value) {
        this.queryParams.add(new ParamEntry<>(key, value.toString()));
        return (T)this;
    }

    public <V> T withQueryParams(final List<ParamEntry<String, String>> queryParams) {
        this.queryParams = queryParams;
        return (T)this;
    }

    public List<ParamEntry<String, String>> getQueryParams() {
        return this.queryParams;
    }

    public List<String> getQueryParam(String key) {
        return this.queryParams.stream().filter(e -> e.key.equals(key)).map(e -> e.value).collect(Collectors.toList());
    }

    public List<String> getQueryParamUriStrings() {
        return this.queryParams.stream().map(ParamEntry::toUriString).collect(Collectors.toList());
    }
}
