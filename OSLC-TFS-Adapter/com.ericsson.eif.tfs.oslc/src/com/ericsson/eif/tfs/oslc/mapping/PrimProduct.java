package com.ericsson.eif.tfs.oslc.mapping;

/*
* Copyright (C) 2015 Ericsson AB. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions
* are met:
*
* 1. Redistributions of source code must retain the above copyright
*    notice, this list of conditions and the following disclaimer.
* 2. Redistributions in binary form must reproduce the above copyright
*    notice, this list of conditions and the following disclaimer
*    in the documentation and/or other materials provided with the
*    distribution.
*
* THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
* "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
* LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
* A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
* OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
* SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
* LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
* DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
* THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
* (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
* OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

public class PrimProduct {
    String primProdNo;
    String primRState;

    public PrimProduct(String primProdNo, String primRState) {
        this.primProdNo = primProdNo;
        this.primRState = primRState;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PrimProduct) {
            PrimProduct pp = (PrimProduct) obj;
            return pp.primProdNo.equals(primProdNo)
                    && pp.primRState.equals(primRState);
        }
        return super.equals(obj);
    }
    
    @Override
    public int hashCode() {
        int hash = primRState.hashCode() * 31 + primProdNo.hashCode();
        return hash;
    }
    
    @Override
    public String toString() {
        return "[" + primProdNo + " " + primRState +"]";
    }
    
    public String getPrimProdNo() {
        return primProdNo;
    }
    
    public String getPrimRState() {
        return primRState;
    }
    
}