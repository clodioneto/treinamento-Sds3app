import Footer from "components/Footer";
import NavBar from "components/NavBar";
import Datatable from "components/Datatable";
import BarChart from "components/BarCharts";
import DonutChart from "components/DonutCharts";



function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de Vendas</h1>

        <div className="row px-3">
          
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Conversão (%)</h5>
            <BarChart></BarChart>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de conversão (%)</h5>
            <DonutChart />
          </div>
        </div>

        <div className="row px-3">
          <h2 className="text-primary">Todas as Vendas</h2>
        </div>
        <Datatable></Datatable>

      </div>
      <Footer></Footer>
    </>
  );
}

export default App;
