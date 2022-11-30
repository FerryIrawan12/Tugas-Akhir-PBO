package data;

import java.util.ArrayList;
import entity.entity_barang2;

public class data_barang {
    private ArrayList <entity_barang2> data_barang;

    public data_barang()
    {
        this.data_barang = new ArrayList<>();
    }

    public void create(int kode, String nama, int harga, int stok)
    {
        this.data_barang.add(new entity_barang2(kode,nama,harga,stok));
    }

    public void view()
    {
        for (int i=0;i<this.data_barang.size();i++)
        {
            this.data_barang.get(i).cetak();
        }
    }

    public void view(int index)
    {
        this.data_barang.get(index).cetak();
    }

    public void update(int index,int kode,String nama,int harga,int stok)
    {
            this.data_barang.set(index,new entity_barang2(kode,nama,harga,stok));
    }

    public void delete(int index)
    {
        this.data_barang.remove(index);
    }
}
