package com.nyash.travellizer.travellizercommon.model.transform.mapper;

/**
 * Enables to convert field values for the source object during object
 * transformation
 *
 * @author Nyash
 *
 */
public interface Mapper<T , V> {

    /**
     * Returns true if this mapper supports conversion of the given type
     *
     * @param clz
     * @return
     */
    boolean supports(Class<T> sourceType, Class<V> destinationType);

    /**
     * Transforms source field value based on the type of the destination object
     * @param sourceValue
     * @param destinationType
     * @return
     */
    Object map(T sourceValue, Class<V> destinationType);
}
