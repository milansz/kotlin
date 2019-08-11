package krizsanmilan.com.kotlinproject

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ListAdapter(val carList: ArrayList <CarModel>, val context: Context): RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: ListAdapter.ViewHolder, position: Int) {
        holder.tvBrand.text = carList[position].brand
        holder.tvName.text = carList[position].name
        holder.tvHorsePower.text = carList[position].horsepower.toString()
        holder.tvAcceleration.text = carList[position].acceleration
        holder.tvColor.text = carList[position].color

        when(carList[position].horsepower){
            EnginePower.LOW.ordinal -> {
                holder.tvHorsePower.setBackgroundColor(context.getColor(R.color.signed))
                holder.tvHorsePower.text = context.getString(R.string.low)
            }
            EnginePower.MEDIUM.ordinal -> {
                holder.tvHorsePower.setBackgroundColor(context.getColor(R.color.in_progress))
                holder.tvHorsePower.text = context.getString(R.string.medium)
            }
            EnginePower.HIGH.ordinal -> {
                holder.tvHorsePower.setBackgroundColor(context.getColor(R.color.error))
                holder.tvHorsePower.text = context.getString(R.string.high)
            }
        }
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val tvBrand = itemView.findViewById<TextView>(R.id.tvCarBrand)
        val tvName = itemView.findViewById<TextView>(R.id.tvCarName)
        val tvHorsePower = itemView.findViewById<TextView>(R.id.tvCarHorsePower)
        val tvAcceleration = itemView.findViewById<TextView>(R.id.tvCarAcceleration)
        val tvColor = itemView.findViewById<TextView>(R.id.tvCarColor)
    }
}