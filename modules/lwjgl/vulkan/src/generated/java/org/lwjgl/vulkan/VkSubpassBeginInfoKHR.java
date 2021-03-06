/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying subpass begin info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCreateRenderpass2#VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code contents} <b>must</b> be a valid {@code VkSubpassContents} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRCreateRenderpass2#vkCmdBeginRenderPass2KHR CmdBeginRenderPass2KHR}, {@link KHRCreateRenderpass2#vkCmdNextSubpass2KHR CmdNextSubpass2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code contents} &ndash; a {@code VkSubpassContents} value specifying how the commands in the next subpass will be provided.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSubpassBeginInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSubpassContents contents;
 * }</code></pre>
 */
public class VkSubpassBeginInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CONTENTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONTENTS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSubpassBeginInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassBeginInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code contents} field. */
    @NativeType("VkSubpassContents")
    public int contents() { return ncontents(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassBeginInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassBeginInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code contents} field. */
    public VkSubpassBeginInfoKHR contents(@NativeType("VkSubpassContents") int value) { ncontents(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassBeginInfoKHR set(
        int sType,
        long pNext,
        int contents
    ) {
        sType(sType);
        pNext(pNext);
        contents(contents);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassBeginInfoKHR set(VkSubpassBeginInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassBeginInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassBeginInfoKHR malloc() {
        return wrap(VkSubpassBeginInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSubpassBeginInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassBeginInfoKHR calloc() {
        return wrap(VkSubpassBeginInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSubpassBeginInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSubpassBeginInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSubpassBeginInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassBeginInfoKHR} instance for the specified memory address. */
    public static VkSubpassBeginInfoKHR create(long address) {
        return wrap(VkSubpassBeginInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassBeginInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSubpassBeginInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSubpassBeginInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSubpassBeginInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassBeginInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSubpassBeginInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSubpassBeginInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSubpassBeginInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSubpassBeginInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassBeginInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkSubpassBeginInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSubpassBeginInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassBeginInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkSubpassBeginInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSubpassBeginInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassBeginInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSubpassBeginInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassBeginInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassBeginInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSubpassBeginInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassBeginInfoKHR.PNEXT); }
    /** Unsafe version of {@link #contents}. */
    public static int ncontents(long struct) { return UNSAFE.getInt(null, struct + VkSubpassBeginInfoKHR.CONTENTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassBeginInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassBeginInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #contents(int) contents}. */
    public static void ncontents(long struct, int value) { UNSAFE.putInt(null, struct + VkSubpassBeginInfoKHR.CONTENTS, value); }

    // -----------------------------------

    /** An array of {@link VkSubpassBeginInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSubpassBeginInfoKHR, Buffer> implements NativeResource {

        private static final VkSubpassBeginInfoKHR ELEMENT_FACTORY = VkSubpassBeginInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSubpassBeginInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassBeginInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkSubpassBeginInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassBeginInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassBeginInfoKHR.npNext(address()); }
        /** Returns the value of the {@code contents} field. */
        @NativeType("VkSubpassContents")
        public int contents() { return VkSubpassBeginInfoKHR.ncontents(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassBeginInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassBeginInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassBeginInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSubpassBeginInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code contents} field. */
        public VkSubpassBeginInfoKHR.Buffer contents(@NativeType("VkSubpassContents") int value) { VkSubpassBeginInfoKHR.ncontents(address(), value); return this; }

    }

}